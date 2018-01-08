package com.example.hp.recyclerviewandcardview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 17-07-2017.
 */

public class NatureModel {
    int imageID;
    String title;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public static List<NatureModel> getObjectlist()
    {
        List<NatureModel> datalist = new ArrayList<>();
        int[] images = getImages();

        for(int i=0;i<images.length;i++)
        {
            NatureModel nature = new NatureModel();
            nature.setImageID(images[i]);
            nature.setTitle("Picture :" + i);
            datalist.add(nature);
        }
        return  datalist;
    }
    public static int[] getImages()
    {
        int images[]={R.drawable.ani_cat_five,R.drawable.ani_cat_four,R.drawable.ani_cat_one,R.drawable.ani_cat_seven,R.drawable.ani_cat_six};
        return images;
    }
}
