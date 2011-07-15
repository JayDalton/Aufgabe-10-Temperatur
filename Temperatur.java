/*############################################################################
  Kodierung: UTF-8 ohne BOM
############################################################################*/

//############################################################################
/** Die Klasse Temperatur dient der Umrechnung zwischen den Einheiten Celsius,
  * Kelvin, Reaumur und Fahrenheit
  *
  * @author Thomas Gerlach
*/
//############################################################################
public class Temperatur
{
  /** Der Wert der Temperatur in Celsius
    */
	private double celsius;

  /** Der max. Grenzwert der Temperatur in Celsius
    */
  public static Double MAXIMUM = 1000.0;

  /** Der max. Grenzwert der Temperatur in Celsius
    */
  public static Double MINIMUM = -1000.0;

  /** Bezeichnung der Temperatureinheit Celsius
    */
  public static String CELSIUS = "GRAD Celsius";

  /** Bezeichnung der Temperatureinheit Kelvin
    */
  public static String KELVIN = "GRAD Kelvin";

  /** Bezeichnung der Temperatureinheit Reaumur
    */
  public static String REAUMUR = "GRAD Réaumur";

  /** Bezeichnung der Temperatureinheit Fahrenheit
    */
  public static String FAHRENHEIT = "GRAD Fahrenheit";
	
  //############################################################################
  /** Initialisiert den Wert der Temperatur auf einen Ausgangswert von 0 °C
  */
  //############################################################################
	public Temperatur()
	{
		celsius = 0.0;
	}

  //############################################################################
  /** Initialisiert den Wert der Temperatur in Celsius auf den übergebenen Wert
  */
  //############################################################################
	public Temperatur(double Temperatur)
	{
		celsius = Temperatur;
	}

  //############################################################################
  /** Ändert den Wert der Temperatur entsprechend der Einheit Celsius
  */
  //############################################################################
	public void setCelsius(double Temperatur)
	{
		celsius = Temperatur;
	}

  //############################################################################
  /** Ändert den Wert der Temperatur entsprechend der Einheit Kelvin
  */
  //############################################################################
	public void setKelvin(double Temperatur)
	{
		celsius = Temperatur - 273.15;
	}

  //############################################################################
  /** Ändert den Wert der Temperatur entsprechend der Einheit Reaumur
  */
  //############################################################################
	public void setReaumur(double Temperatur)
	{
		celsius = Temperatur * 1.25;
	}

  //############################################################################
  /** Ändert den Wert der Temperatur entsprechend der Einheit Fahrenheit
  */
  //############################################################################
	public void setFahrenheit(double Temperatur)
	{
		celsius = (Temperatur - 32.0) / 1.8;
	}

  //############################################################################
  /** Liefert den Wert der Temperatur entsprechend der Einheit Celsius
  */
  //############################################################################
	public double getCelsius()
	{
		return celsius;
	}

  //############################################################################
  /** Liefert den Wert der Temperatur entsprechend der Einheit Kelvin
  */
  //############################################################################
	public double getKelvin()
	{
		return celsius + 273.15;
	}

  //############################################################################
  /** Liefert den Wert der Temperatur entsprechend der Einheit Reaumur
  */
  //############################################################################
	public double getReaumur()
	{
		return celsius * 0.8;
	}

  //############################################################################
  /** Liefert den Wert der Temperatur entsprechend der Einheit Fahrenheit
  */
  //############################################################################
	public double getFahrenheit()
	{
		return celsius * 1.8 + 32.0;
	}

}