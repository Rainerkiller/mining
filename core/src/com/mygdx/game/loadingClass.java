package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import java.util.ArrayList;

class loadingClass extends ApplicationAdapter {
    Player role;
    orl dirt;
    orl coal;
    orl steel;
    orl gold;
    orl dimand;
    public void loadDirt(){
        ArrayList<Sprite> picture = new ArrayList<Sprite>();
        picture.add(new Sprite(new Texture("pics/earth1.png")));
        picture.add(new Sprite(new Texture("pics/earth2.png")));
        picture.add(new Sprite(new Texture("pics/earth3.png")));
        picture.add(new Sprite(new Texture("pics/earth4.png")));
        picture.add(new Sprite(new Texture("pics/earth5.png")));
        picture.add(new Sprite(new Texture("pics/earth6.png")));
        dirt = new orl("dirt", 0,picture);
    }
    public void loadRole(){
        ArrayList<Sprite> walkR = new ArrayList<Sprite>();
        ArrayList<Sprite> walkL = new ArrayList<Sprite>();
        ArrayList<Sprite> roleStatic = new ArrayList<Sprite>();
        ArrayList<Sprite> roleTakeDamage = new ArrayList<Sprite>();

        walkL.add(new Sprite(new Texture("pics/roleWalkLeft1.png")));
        walkL.add(new Sprite(new Texture("pics/roleWalkLeft2.png")));
        walkR.add(new Sprite(new Texture("pics/roleWalkRight1.png")));
        walkR.add(new Sprite(new Texture("pics/roleWalkRight2.png")));
        roleStatic.add(new Sprite(new Texture("pics/roleStatic1.png")));
        roleStatic.add(new Sprite(new Texture("pics/roleStatic2.png")));

    }
    public void loadccoal(){

    }
}
