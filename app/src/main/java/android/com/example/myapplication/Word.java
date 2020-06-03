package android.com.example.myapplication;

public class Word {
    private String mItemName;
    private int mImageResourceId;

    public Word(String itemName, int imageResourceId){
        mItemName = itemName;
        mImageResourceId = imageResourceId;
    }

    public String getItemName(){
        return mItemName;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}
