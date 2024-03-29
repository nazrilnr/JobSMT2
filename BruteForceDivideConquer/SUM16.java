class SUM16 {
    int elemen;
    double[] keuntungan;

    public SUM16(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
    }

    public void setKeuntungan(double[] keuntungan) {
        this.keuntungan = keuntungan;
    }

    public double totalBF() {
        double total = 0;
        for (int i = 0; i < elemen; i++) {
            total += keuntungan[i];
        }
        return total;
    }

    public double totalDC() {
        return totalDC(keuntungan, 0, elemen - 1);
    }

    private double totalDC(double[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        } else {
            int mid = (left + right) / 2;
            double leftSum = totalDC(arr, left, mid);
            double rightSum = totalDC(arr, mid + 1, right);
            return leftSum + rightSum;
        }
    }
}