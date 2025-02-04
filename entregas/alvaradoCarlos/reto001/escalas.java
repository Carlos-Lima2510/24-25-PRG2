class escalas {
    public static void main(String[] args) {
        String[] arrayNotas = {"do", "do#", "re", "re#", "mi", "fa", "fa#", "sol", "sol#", "la", "la#", "si", "do"};

        escalaMayor(arrayNotas);
    }

    public static void escalaMayor(String[] arrayNotas) {
        int[] intervalos = {0, 2, 4, 5, 7, 9, 11, 12};

        for (int i = 0; i < intervalos.length; i++) {
            System.out.println(arrayNotas[intervalos[i]]);
        }
    }
}