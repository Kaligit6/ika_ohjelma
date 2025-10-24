public class App {
    public static void main(String[] args) throws Exception {
        int ika = 30;

        if (ika >= 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }
            if (ika >= 16) {
                System.out.println("Saat ajaa kevaria");
            }
            
        }
        else if (ika >= 65)
        {
            System.out.println("Olet eläkeläinen");
        }
        if (ika == 70 || ika == 80 || ika == 90) {
            System.out.println("Onnea vuosikymmenistä");
        }
        if (ika == 100) {
            System.out.println("Onnea sadasta vuodesta");
            System.out.println("Onnea sadasta vuodesta");
            System.out.println("Onnea sadasta vuodesta");
        }
        else if (ika >= 18 && ika < 65)
        {
            System.out.println("Olet aikuinen");
        }
        if (ika == 18) {
            System.out.println("Saat ajaa autoa");
        }
        if (ika == 10 || ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60)
        {
            System.out.println("Onnea kymmenys vuodesta");
        }
        if (ika >= 58 && ika < 65) {
            System.out.println("Voit harkita varhaiseläkettä");
        } 
        if (ika >= 40 && ika <= 50) {
                System.out.println("Parasta keski-ikää");
            }
        
    }
}


