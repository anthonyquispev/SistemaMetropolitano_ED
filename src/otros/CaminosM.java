package otros;

public class CaminosM {

    int nodos;
    double A[][];
    double D[][];
    int P[][];
    String nombreRuta = "";
    double min;

    public CaminosM(double v[][], String nombreRuta) {
        this.nombreRuta = nombreRuta;
        nodos = v.length;
        A = new double[nodos][nodos];
        for (int i = 0; i < nodos; i++) {
            for (int j = 0; j < nodos; j++) {
                A[i][j] = v[i][j];
            }
        }
    }

    public void MetodoFloyd() {
        D = new double[nodos][nodos];
        P = new int[nodos][nodos];
        for (int i = 0; i < nodos; i++) {
            for (int j = 0; j < nodos; j++) {
                D[i][j] = A[i][j];
                P[i][j] = 0;
            }
        }
        for (int n = 0; n < nodos; n++) {
            for (int i = 0; i < nodos; i++) {
                for (int j = 0; j < nodos; j++) {
                    if (D[i][j] > D[i][n] + D[n][j]) {
                        D[i][j] = D[i][n] + D[n][j];
                        P[i][j] = n + 1;
                    }
                }
            }
        }
    }

    public void Minimo(int a, int b) {
        if (D[a][b] == 999) {
            min = 999;
        } else {
            min = D[a][b];

        }
    }

    public String Nombre(int a) {
        String[] N = {"Naranjal", "Izaguirre", "Pacifico", "Independencia", "Los Jazmines",
            "Tomás Valle", "El Milagro", "Honorio Delgado", "UNI", "Parque del Trabajo", "Caquetá",
            "Ramón Castilla", "Tacna", "Jirón de la Unión", "Colmena", "Dos de Mayo", "Quilca", "España",
            "Estacion Central", "Estadio Nacional", "México", "Canadá", "Javier Prado", "Carnaval Moreyra",
            "Aramburú", "Domingo Orué", "Angamos", "Ricardo Palma", "Benavides", "28 de Julio", "Plaza de Flores",
            "Balta", "Bulevar", "Estadio Unión", "Escuela Militar", "Terán", "Rosario de Villa", "Matellini"};
        return N[a];
    }
}
