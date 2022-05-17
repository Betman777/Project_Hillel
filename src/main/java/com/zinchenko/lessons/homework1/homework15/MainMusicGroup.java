package com.zinchenko.lessons.homework1.homework15;

public class MainMusicGroup {
    public static void main(String[] args) {
        PopMusic popMusicGroup = new PopMusic();
        RockMusic rockMusicGroup = new RockMusic();
        ClassicMusic classicMusicGroup = new ClassicMusic();


        MusicStyles [] array2 = new MusicStyles[]{
                popMusicGroup,rockMusicGroup,classicMusicGroup
        };
        for (MusicStyles musicStyles : array2){
            musicStyles.playMusic();
        }

        MusicStyles [] array = new MusicStyles[]{
                new PopMusic(),new RockMusic(),new ClassicMusic()
        };
        for (MusicStyles musicStylesGroup : array){
            musicStylesGroup.playMusic();
        }
    }
}
