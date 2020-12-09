public class Type {
    // declaring barcode and type
    private int Barcode;
    private int Type;


    // this constructor initializes the values of the class
    public Type() {
        this.Barcode = 0;
        this.Type = 0;
    }

    //  this function returns the barcode value
    public int getBarcodes() {
        return Barcode;
    }


    // this function sets the barcode value
    public void setBarcodes(int barcodes) {
        this.Barcode = barcodes;
    }


    // this function returns the type value
    public int getType() {
        return Type;
    }

    // this function sets the type value
    public void setType(int type) {
        if (type <= 100 && type >= 1)
            this.Type = type;
        else
            this.Type = 10;
    }

}

