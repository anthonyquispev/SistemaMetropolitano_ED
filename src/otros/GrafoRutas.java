package otros;

import java.io.Serializable;

public class GrafoRutas implements Serializable{

    public static String rutas(String a, String b) {
        //Estaciones
        String[] E = {"Naranjal", "Izaguirre", "Pacifico", "Independencia", "Los Jazmines",
            "Tomás Valle", "El Milagro", "Honorio Delgado", "UNI", "Parque del Trabajo", "Caquetá",
            "Ramón Castilla", "Tacna", "Jirón de la Unión", "Colmena", "Dos de Mayo", "Quilca", "España",
            "Estacion Central", "Estadio Nacional", "México", "Canadá", "Javier Prado", "Carnaval Moreyra",
            "Aramburú", "Domingo Orué", "Angamos", "Ricardo Palma", "Benavides", "28 de Julio", "Plaza de Flores",
            "Balta", "Bulevar", "Estadio Unión", "Escuela Militar", "Terán", "Rosario de Villa", "Matellini"};

        //Regular A
        double[][] A = new double[38][38];

        for (int i = 0; i < 38; i++) {
            for (int j = 0; j < 38; j++) {
                A[i][j] = 999;
            }
        }
        for (int i = 0; i < 38; i++) {
            A[i][i] = 0;
        }
        A[0][1] = 19.9;
        A[1][2] = 2.4;
        A[2][3] = 2.1;
        A[3][4] = 1.6;
        A[4][5] = 26.8;
        A[5][6] = 0.6;
        A[6][7] = 20.8;
        A[7][8] = 10.1;
        A[8][9] = 22.1;
        A[9][10] = 21.2;
        A[10][11] = 14.9;
        A[11][12] = 17.1;
        A[12][13] = 27.1;
        A[13][14] = 11;
        A[14][15] = 16.9;
        A[15][19] = 29.2;
        A[1][0] = 19.1;
        A[2][1] = 2.4;
        A[3][2] = 2.1;
        A[4][3] = 1.6;
        A[5][4] = 26.8;
        A[6][5] = 0.6;
        A[7][6] = 20.8;
        A[8][7] = 10.1;
        A[9][8] = 22.2;
        A[10][9] = 21.3;
        A[11][10] = 13.9;
        A[12][11] = 17.1;
        A[13][12] = 27.1;
        A[14][13] = 11;
        A[15][14] = 16.9;
        A[19][15] = 29.2;

        //Regular B
        double[][] B = new double[38][38];

        for (int i = 0; i < 38; i++) {
            for (int j = 0; j < 38; j++) {
                B[i][j] = 999;
            }
        }
        for (int i = 0; i < 38; i++) {
            B[i][i] = 0;
        }
        
        B[0][1] = 1.5;
        B[1][2] = 2.5;
        B[2][3] = 2.7;
        B[3][4] = 3.2;
        B[4][5] = 12.2;
        B[5][6] = 14.1;
        B[6][7] = 15.2;
        B[7][8] = 16.6;
        B[8][9] = 17.8;
        B[9][10] = 26.6;
        B[10][11] = 28.6;
        B[11][16] = 28.7;
        B[16][17] = 31.6;
        B[17][18] = 33.3;
        B[18][19] = 34.4;
        B[19][20] = 38.4;
        B[20][21] = 42.8;
        B[21][22] = 43;
        B[22][23] = 53.6;
        B[23][24] = 34.5;
        B[24][25] = 6.6;
        B[25][26] = 27.5;
        B[26][27] = 17.8;
        B[27][28] = 6.9;
        B[28][29] = 36.5;
        B[29][30] = 29.5;
        B[30][31] = 42.3;
        B[31][32] = 91.5;
        B[32][33] = 30.2;
        B[33][34] = 14.4;
        B[34][35] = 12.3;
        B[35][36] = 10;
        B[36][37] = 5;
        B[1][0] = 1;
        B[2][1] = 1.5;
        B[3][2] = 2.5;
        B[4][3] = 2.7;
        B[5][4] = 3.2;
        B[6][5] = 12.2;
        B[7][6] = 14.1;
        B[8][7] = 15.2;
        B[9][8] = 16.6;
        B[10][9] = 28.7;
        B[11][10] = 30.2;
        B[16][11] = 32.6;
        B[17][16] = 33.8;
        B[18][17] = 36.6;
        B[19][18] = 40.9;
        B[20][19] = 42.5;
        B[21][20] = 1;
        B[22][21] = 1.6;
        B[23][22] = 4.3;
        B[24][23] = 9.9;
        B[25][24] = 10.5;
        B[26][25] = 12;
        B[27][26] = 16.8;
        B[28][27] = 22;
        B[29][28] = 23.8;
        B[30][29] = 28.7;
        B[31][30] = 30.2;
        B[32][31] = 32.6;
        B[33][32] = 33.8;
        B[34][33] = 36.6;
        B[35][34] = 40.9;
        B[36][35] = 42.5;
        B[37][36] = 30.2;

        //Expreso 1
        double[][] E1 = new double[38][38];

        for (int i = 0; i < 38; i++) {
            for (int j = 0; j < 38; j++) {
                E1[i][j] = 999;
            }
        }
        //inicializar diagonal
        for (int i = 0; i < 38; i++) {
            E1[i][i] = 0;
        }

        E1[18][19] = 20;
        E1[19][20] = 2.4;
        E1[20][23] = 12.1;
        E1[23][24] = 9.9;
        E1[24][27] = 11.6;
        E1[27][28] = 6.8;
        E1[28][30] = 13.5;
        E1[30][32] = 20.8;
        E1[32][33] = 10.1;
        E1[33][34] = 12.1;
        E1[34][35] = 11.2;
        E1[35][36] = 4.9;
        E1[36][37] = 17.1;
        E1[37][36] = 7.1;
        E1[36][37] = 11;
        E1[35][36] = 6.9;
        E1[34][35] = 9.2;
        E1[33][34] = 19.1;
        E1[32][33] = 2.4;
        E1[30][32] = 2.1;
        E1[28][30] = 1.6;
        E1[27][28] = 26.8;
        E1[24][27] = 3.6;
        E1[23][24] = 10.8;
        E1[20][23] = 10.1;
        E1[19][20] = 22.2;

        //Super Expreso Norte
        double[][] SXN = new double[38][38];

        for (int i = 0; i < 38; i++) {
            for (int j = 0; j < 38; j++) {
                SXN[i][j] = 999;
            }
        }
        //inicializar diagonal
        for (int i = 0; i < 38; i++) {
            SXN[i][i] = 0;
        }
        SXN[0][15] = 20;
        SXN[15][16] = 2.4;
        SXN[16][17] = 2.1;
        SXN[17][18] = 9.9;
        SXN[18][17] = 11.6;
        SXN[17][16] = 6.8;
        SXN[16][15] = 13.5;
        SXN[15][16] = 20.8;
        SXN[0][15] = 10.1;

        CaminosM Ca = new CaminosM(A, "Regular A");
        CaminosM Cb = new CaminosM(B, "Regular B");
        CaminosM Ce1 = new CaminosM(E1, "Expreso 1");
        CaminosM Csxn = new CaminosM(SXN, "Super Expreso Norte");

        Ca.MetodoFloyd();
        Cb.MetodoFloyd();
        Ce1.MetodoFloyd();
        Csxn.MetodoFloyd();

        int n = 0, m = 0;

        for (int i = 0; i < E.length; i++) {
            if (a.equals(E[i])) {
                n = i;
            }
            if (b.equals(E[i])) {
                m = i;
            }
        }

        Ca.Minimo(n, m);
        Cb.Minimo(n, m);
        Ce1.Minimo(n, m);
        Csxn.Minimo(n, m);
        return compararRutas(Ca, Cb, Ce1, Csxn);
    }

    public static String compararRutas(CaminosM min1, CaminosM min2, CaminosM min3, CaminosM min4) {
        String retorno = "";
        double minF = 9999;
        String rutaF = "";
        
        if (min1.min < min2.min) {
            minF = min1.min;
            rutaF = min1.nombreRuta;
        }
        if (min2.min < minF) {
            minF = min2.min;
            rutaF = min2.nombreRuta;
        }

        if (min3.min < minF) {
            minF = min3.min;
            rutaF = min3.nombreRuta;
        }

        if (min4.min < minF) {
            minF = min4.min;
            rutaF = min4.nombreRuta;
        }
        retorno += "Tiempo mínimo: \n" + minF;
        retorno += "\nTomar la Ruta: \n" + rutaF;
        return retorno;
    }
}
