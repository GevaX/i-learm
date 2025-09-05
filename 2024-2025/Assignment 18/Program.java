public class Program {
    public static int legalCities(CameraInfo[] cameras) {
        int c = 0;
        boolean[] cities = new boolean[100];

        for (int i = 0; i < cameras.length; i++) {
            int city = cameras[i].getCity();
            if (cameras[i].allGood() && !cities[city]) {
                c++;
                cities[city] = true;
            }
        }
        return c;
    }
}