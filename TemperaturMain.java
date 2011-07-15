/*############################################################################
  Kodierung: UTF-8 ohne BOM
############################################################################*/

//############################################################################
/** Ein Java-Programm fuer die Umrechnung von Temperaturen. Nach Eingabe von der jeweiligen
  * Temperatureinheit und der dazugehoerigen Temperatur werden die jeweilig anderen Temperaturen
  * berechnet und ausgegeben. Das Programm kann so lange genutzt werden, bis es die Benutzer und
  * Benutzerinnen explizit nicht mehr wuenschen.
  * 
  * @author Thomas Gerlach
  */
//############################################################################
public class TemperaturMain
{
  //##########################################################################
  /** Schreibt auf dem Bildschirm den Titel des Programms und fordert den Benutzer zur Eingabe der
    * Temperatureinheit, sowie der Temperatur auf. Es gewaehrleistet die Ausfuehrung des Programms,
    * solange es der Benutzer wuenscht.
    *
    */
  //##########################################################################
	public static void main(String[] args)
	{
    Ausgabe.leere();
		Ausgabe.zeile("\n\n\tT e m p e r a t u r e n\n\n");
		Ausgabe.zeile("Ich konvertiere eine Temperatur in eine wählbare Einheit");

    do {
      
      dialog();
      
    } while (Eingabe.auswahl("Noch einmal? (j/n): ", "j", "n"));
    
    Ausgabe.zeile("\n\n\tAuf Wiedersehen!\n\n");
	}

  //##########################################################################
  /** Steuert die Dialogführung bei Auswahl der Ausgangstemperatureinheit
  */
  //##########################################################################
	private static void dialog()
  {
    Temperatur temp = new Temperatur();
    String titel = "Bitte geben Sie die Temperatur in %s ein: ";

    Ausgabe.zeile("");
    Ausgabe.zeile("Aus welcher Temperatur möchten sie umrechnen?");
    Ausgabe.zeile("");
    Ausgabe.zeile("  (1) Celsius");
    Ausgabe.zeile("  (2) Fahrenheit");
    Ausgabe.zeile("  (3) Kelvin");
    Ausgabe.zeile("  (4) Réaumur");

    switch (Eingabe.ganzzahl("Auswahl: ", 1, 4)) {

      case 1:
        dialog_celsius(String.format(titel, temp.CELSIUS), temp);
        break;

      case 2:
        dialog_fahrenheit(String.format(titel, temp.FAHRENHEIT), temp);
        break;

      case 3:
        dialog_kelvin(String.format(titel, temp.KELVIN), temp);
        break;

      case 4:
        dialog_reaumur(String.format(titel, temp.REAUMUR), temp);
        break;
    }
  }

  //##########################################################################
  /**
  */
  //##########################################################################
	private static void dialog_celsius(String titel, Temperatur temp)
  {
    temp.setCelsius(Eingabe.gleitzahl(String.format(titel, temp.CELSIUS), temp.MINIMUM, temp.MAXIMUM));
    System.out.format("\n");
    System.out.format("\n%8.2f %-30s %8.2f %s", temp.getCelsius(), String.format("%s entsprechen:", temp.CELSIUS), temp.getFahrenheit(), temp.FAHRENHEIT);
    System.out.format("\n%48.2f %s", temp.getKelvin(), temp.KELVIN);
    System.out.format("\n%48.2f %s", temp.getReaumur(), temp.REAUMUR);
    System.out.format("\n");
  }

  //##########################################################################
  /**
  */
  //##########################################################################
	private static void dialog_kelvin(String titel, Temperatur temp)
  {
    temp.setKelvin(Eingabe.gleitzahl(String.format(titel, temp.KELVIN), temp.MINIMUM, temp.MAXIMUM));
    System.out.format("\n");
    System.out.format("\n%8.2f %-30s %8.2f %s", temp.getKelvin(), String.format("%s entsprechen:", temp.KELVIN), temp.getReaumur(), temp.REAUMUR);
    System.out.format("\n%48.2f %s", temp.getCelsius(), temp.CELSIUS);
    System.out.format("\n%48.2f %s", temp.getFahrenheit(), temp.FAHRENHEIT);
    System.out.format("\n");
  }

  //##########################################################################
  /**
  */
  //##########################################################################
	private static void dialog_reaumur(String titel, Temperatur temp)
  {
    temp.setReaumur(Eingabe.gleitzahl(String.format(titel, temp.REAUMUR), temp.MINIMUM, temp.MAXIMUM));
    System.out.format("\n");
    System.out.format("\n%8.2f %-30s %8.2f %s", temp.getReaumur(), String.format("%s entsprechen:", temp.REAUMUR), temp.getKelvin(), temp.KELVIN);
    System.out.format("\n%48.2f %s", temp.getCelsius(), temp.CELSIUS);
    System.out.format("\n%48.2f %s", temp.getFahrenheit(), temp.FAHRENHEIT);
    System.out.format("\n");
  }

  //##########################################################################
  /**
  */
  //##########################################################################
	private static void dialog_fahrenheit(String titel, Temperatur temp)
  {
    temp.setFahrenheit(Eingabe.gleitzahl(titel, temp.MINIMUM, temp.MAXIMUM));
    System.out.format("\n");
    System.out.format("\n%8.2f %-30s %8.2f %s", temp.getFahrenheit(), String.format("%s entsprechen:", temp.FAHRENHEIT), temp.getCelsius(), temp.CELSIUS);
    System.out.format("\n%48.2f %s", temp.getKelvin(), temp.KELVIN);
    System.out.format("\n%48.2f %s", temp.getReaumur(), temp.REAUMUR);
    System.out.format("\n");
  }
}


