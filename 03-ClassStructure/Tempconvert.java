public class Tempconvert {
    double celsius;
    double kelvin;
    double farenheit;

    void CesliusToKelvin(){
        double kelvin = (celsius - 275);
        System.out.println(kelvin);
    }

    void KelvinToCelsius(){
        double celsius = kelvin + 275;
        System.out.println(celsius);
    }

    void CesliusToFarenheit(){
        farenheit = (celsius * 9/5) + 32; 
        System.out.println(farenheit);
    }

    void FarenheitToCelsius(){
        celsius = (farenheit  - 32) * 5/9;
        System.out.println(celsius);
    }
    
    void FarenheitToKelvin(){
            kelvin = (farenheit - 32) * 5/9 + 273.15;
            System.out.println(kelvin);
        }


    public static void main(String[] args) {
        Tempconvert t = new Tempconvert();
        t.celsius = 20;
        t.CesliusToFarenheit();
        t.CesliusToKelvin();
        t.farenheit = 100;
        t.FarenheitToCelsius();
        t.FarenheitToKelvin();

    }
}
