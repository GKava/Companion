package allinone.help.fortnite.battleroyalecompanion.InfoContent;


import java.util.ArrayList;
import java.util.List;




public class InfoContentItem {
    private int imageName1;
    private String txt_card;
    private String char1_txt;
    private String char2_txt;

    public InfoContentItem(int imageName1, String txt_card, String char1_txt, String char2_txt) {
        this.imageName1 = imageName1;
        this.txt_card = txt_card;
        this.char1_txt = char1_txt;
        this.char2_txt = char2_txt;
    }

    public String getChar1_txt() {

        return char1_txt;
    }

    public void setChar1_txt(String char1_txt) {
        this.char1_txt = char1_txt;
    }

    public String getChar2_txt() {
        return char2_txt;
    }

    public void setChar2_txt(String char2_txt) {
        this.char2_txt = char2_txt;
    }

    public String getTxt_card() {
        return txt_card;
    }

    public void setTxt_card(String txt_card) {
        this.txt_card = txt_card;
    }

    public void setImageName1(int imageName1) {
        this.imageName1 = imageName1;
    }


    public int getImageName1() {

        return imageName1;
    }

}