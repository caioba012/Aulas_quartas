public class Main {
    public static void main(String[] args) throws Exception{
        FilaAnda<Integer> f1 = new FilaAnda<Integer> (1000000);

        for (int i = 0; i < 100000;i++){
            f1.guardeUmItem(i);
        }

        for (int j = 1000000 ; j != 0; j--){
            f1.removaUmItem();
        }
    }
}
