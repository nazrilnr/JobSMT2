public class Faktorial {

    public int nilai;

    public int fatorialBF (int n){
        int fakto = 1;
        for (int i = 1; i <= n; i ++){
            fakto = fakto * i;
        }
        return fakto;
    }

    //NOMOR 3
    // public int fatorialBF(int n) {
    //     int fakto = 1;
    //     int i = 1;
    //     while (i <= n) {
    //         fakto = fakto * i;
    //         i++;
    //     }
    //     return fakto;
    // }
    
    public int fatorialDC (int  n){
        if (n == 1){
            return 1;
        }
        else{
            int fakto = n *fatorialDC(n - 1);
            return fakto;
        }
    }
}