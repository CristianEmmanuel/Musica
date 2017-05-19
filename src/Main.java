
public class Main {

    public static void main(String[] args) {

        Tema hellBells = new Tema("Hells bells ", 5.12);
        Tema shootToThrill = new Tema("Shoot to thrill", 5.20);
        Tema whatDoYouDoforMoneyHoney = new Tema("What Do You Do for Money Honey", 3.36);
        Tema givenTheDogABone = new Tema("Given The Dog A Bone" , 3.32);
        Tema letMePutmyLoveIntoYou = new Tema("Let Me Put my Love Into You", 4.16);
        Tema backInBlack = new Tema("Back In Black", 4.34);
        Tema youShookMeAllNightLong = new Tema("You Shook Me All Night Long",3.31);
        Tema haveaDrinkonMe = new Tema("Have a Drink on Me",4.00);


        Cd cdDeACDC;
        cdDeACDC = new Cd("Back In Black");
        cdDeACDC.agregarTema(hellBells);
        cdDeACDC.agregarTema(shootToThrill);
        cdDeACDC.agregarTema(whatDoYouDoforMoneyHoney);
        cdDeACDC.agregarTema(givenTheDogABone);

        Cd cdDeACDC1;
        cdDeACDC1 = new Cd("The eyes");
        cdDeACDC1.agregarTema(letMePutmyLoveIntoYou);
        cdDeACDC1.agregarTema(backInBlack);
        cdDeACDC1.agregarTema(youShookMeAllNightLong);
        cdDeACDC1.agregarTema(haveaDrinkonMe);


        ReproductorDeCds reproductorDeCds;
        reproductorDeCds= new ReproductorDeCds();
        reproductorDeCds.setUnCdParaReproducir(cdDeACDC1);
        reproductorDeCds.reproducirCd(2);





    }
}
