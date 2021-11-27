package NesneYonelimliProgramlamaKitap;

public class matrisTranspoze {
    public static void main(String[] args) {
        int j,i;
        //A[3][4] matrisinin elemanları
        int A[][] = {{0,1,2,3},{4,5,6,7},{8,9,0,4}};
        int B[][] = new int[4][3]; //B[4][3] MATRİSİ
        System.out.printf("A matrisi...:\n");
        for (i = 0; i < 3; ++i)
        {
            for (j = 0; j<3; ++j)
            {
                System.out.printf("%d",A[i][j]);
                //A MATRİSİN,N TRANSPOZESİ
                B[j][i] = A[i][j];
            } //for j sonu
            System.out.printf("\n");
        }//for i sonu
        System.out.printf("B matrisi...:\n");
        for (i =0; i<4;++i){
            for (j =0; j<3;++j){
                System.out.printf("%d",B[i][j]);
            }//for j sonu
            System.out.println();
        }//for i sonu
    }
}
