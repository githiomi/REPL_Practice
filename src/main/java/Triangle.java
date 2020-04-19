class Triangle{
    public int mSideOne;
    public int mSideTwo;
    public int mSideThree;

    public Triangle(int sideOne, int sideTwo, int sideThree){
        mSideOne = sideOne;
        mSideTwo = sideTwo;
        mSideThree = sideThree;
    }

    public String triangleType(int lOne, int lTwo, int lThree){
        if ( lOne == lTwo && lTwo == lThree && lOne == lThree){
            return "Equilateral";
        }
        if (lOne == lTwo && lOne != lThree || lTwo == lThree && lTwo != lOne){
            return "Isosceles";
        }

        if ( lOne != lTwo || lTwo != lThree || lOne != lThree){
            return "Scalene";
        }
        return null;
    }
}