package Hayvanlar;
class Hayvan {
    private String isim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String konus() {

        return "Hayvan konusuyor...";
    }
}
 class Kedi extends Hayvan {

     public Kedi(String isim) {
         super(isim);
     }


     @Override
     public String konus() {
         return this.getIsim()+" miyavliyor...";
     }
 }
class Kopek extends Hayvan{
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" havliyor....";
    }
}
class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kisniyor...";
    }
    }
    class Kus extends Hayvan {
        public Kus(String isim) {
            super(isim);
        }

        @Override
        public String konus() {
            return this.getIsim() + " civildiyor...";
        }
    }



    public class Main {
     //     public static void konustur(Hayvan hayvan) {
            //  System.out.println(hayvan.konus());

           // }// //2.yontem

        public static void konustur(Object object) {
            if (object instanceof Kopek) {
                Kopek kopek = (Kopek) object;
                System.out.println( kopek.konus());
            } else if (object instanceof Kedi) {
                Kedi kedi = (Kedi) object;
                System.out.println(kedi.konus());

            } else if (object instanceof At) {
                At at = (At) object;
                System.out.println(at.konus());
            } else if (object instanceof Kus) {
                    Kus kus = (Kus) object;
                    System.out.println(kus.konus());


                } else if (object instanceof Hayvan) {
                Hayvan hayvan = (Hayvan) object;
                System.out.println(hayvan.konus());
            }
        }
                public static void main(String[] args) {
            /*
                Hayvan hayvan = new Hayvan("Limon");
                Hayvan hayvan1 = new Kedi("Tekir");//Tekirmiyavliyor...
                Hayvan hayvan2 = new Kopek("Karabas");//Karabashavliyor
                Hayvan hayvan3=new Hayvan("Sahbatur") ;//Sahbaturkisniyor
                 System.out.println(hayvan1.konus());
                System.out.println(hayvan2.konus());
                System.out.println(hayvan3.konus());
          Veyaaaaaa
             */
         /*   konustur(new Kedi("Tekir"));//Tekirmiyavliyor...
            konustur(new Kopek("Karabas"));// Karabas havliyor
            konustur(new At("Sahbatur"));//At kisniyor
            // "*******************************************************************""

            // Kopek kopek = new Kopek("Karabas");
            //   if (Kopek instanceof Hayvan) {
            //     System.out.println("Bu nesne hayvan sinifindan...");
//////////////   VEYAAAAAA     //////////////////
            Kedi kedi = new Kedi("Tekir");

            if (kedi instanceof Hayvan) {
                System.out.println("Bu nesne hayvan sinifindan...");
          */
        ///////veya////////////////
        Kopek kopek = new Kopek("karabas");
        Kedi kedi = new Kedi("Tekir");
        At at = new At("Sahbatur");

        Hayvan hayvan = new Hayvan("Limon");
        Kus kus=new Kus("Mavis");
        konustur(kopek);

        konustur(kedi);

        konustur(at);

        konustur(hayvan);

        konustur(kus);

            }
        }






