package NivelBasico;

public class ConversorDeUnidades {

    public static void main(String[] args) {

        System.out.println(convertirCelsiusAFahrenheit(25));
        System.out.println(convertirCelsiusAKelvin(25));
        System.out.println(convertirFahrenheitACelsius(77));
        System.out.println(convertirFahrenheitAKelvin(77));
        System.out.println(convertirKelvinACelsius(298.15));
        System.out.println(convertirKelvinAFahrenheit(298.15));

        System.out.println(convertirMetrosAKilometros(1000));
        System.out.println(convertirMetrosAMillas(1609.34));
        System.out.println(convertirKilometrosAMetros(1));
        System.out.println(convertirKilometrosAMillas(1.60934));
        System.out.println(convertirMillasAMetros(1));
        System.out.println(convertirMillasAKilometros(1));

        System.out.println(convertirLibrasAKilogramos(150));
        System.out.println(convertirLibrasAOnzas(150));
        System.out.println(convertirKilogramosALibras(68.0389));
        System.out.println(convertirKilogramosAOnzas(68.0389));
        System.out.println(convertirOnzasALibras(16));
        System.out.println(convertirOnzasAKilogramos(16));

        System.out.println(convertirSegundosAMinutos(120));
        System.out.println(convertirSegundosAHoras(3600));
        System.out.println(convertirMinutosASegundos(2));
        System.out.println(convertirMinutosAHoras(120));
        System.out.println(convertirHorasASegundos(1));
        System.out.println(convertirHorasAMinutos(1));
        
    }

    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double convertirCelsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double convertirFahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double convertirFahrenheitAKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double convertirKelvinACelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double convertirKelvinAFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    


    public static double convertirMetrosAKilometros(double metros) {
        return metros / 1000;
    }

    public static double convertirMetrosAMillas(double metros) {
        return metros * 0.000621371;
    }

    public static double convertirKilometrosAMetros(double kilometros) {
        return kilometros * 1000;
    }

    public static double convertirKilometrosAMillas(double kilometros) {
        return kilometros * 0.621371;
    }

    public static double convertirMillasAMetros(double millas) {
        return millas / 0.000621371;
    }

    public static double convertirMillasAKilometros(double millas) {
        return millas / 0.621371;
    }





    public static double convertirLibrasAKilogramos(double libras) {
        return libras * 0.453592;
    }

    public static double convertirLibrasAOnzas(double libras) {
        return libras * 16;
    }

    public static double convertirKilogramosALibras(double kilogramos) {
        return kilogramos / 0.453592;
    }

    public static double convertirKilogramosAOnzas(double kilogramos) {
        return kilogramos * 35.274;
    }

    public static double convertirOnzasALibras(double onzas) {
        return onzas / 16;
    }

    public static double convertirOnzasAKilogramos(double onzas) {
        return onzas / 35.274;
    }




    public static double convertirSegundosAMinutos(double segundos) {
        return segundos / 60;
    }

    public static double convertirSegundosAHoras(double segundos) {
        return segundos / 3600;
    }

    public static double convertirMinutosASegundos(double minutos) {
        return minutos * 60;
    }

    public static double convertirMinutosAHoras(double minutos) {
        return minutos / 60;
    }

    public static double convertirHorasASegundos(double horas) {
        return horas * 3600;
    }

    public static double convertirHorasAMinutos(double horas) {
        return horas * 60;
    }


    
}
