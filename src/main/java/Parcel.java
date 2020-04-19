class Parcel{
    String mName;
    int mLength;
    int mWidth;
    int mHeight;


    public Parcel (String name, int length, int width, int height){
        mName = name;
        mLength = length;
        mWidth = width;
        mHeight = height;
    }

    public int parcelVolume(int l, int w, int h){
        return l * w * h;
    }

    public int costCalculator(int l, int w, int h){
        int nl = l * 5;
        int nw = w * 10;
        int nh = h * 15;

        return nl + nw + nh;
    }
}