package kalkulator;

public enum Operacje {
    DODAWANIE {
        double licz(double a, double b) {
            return a + b;
        }
    },
    ODEJMOWANIE {
        double licz(double a, double b) {
            return a - b;
        }
    },
    MNOZENIE {
        double licz(double a, double b) {
            return a * b;
        }
    },
    DZIELENIE {
        double licz(double a, double b) {
            return a / b;
        }
    };


    abstract double licz(double a, double b);


}
