import java.util.HashMap;
import java.util.Map;

class TwelveDays {

    private static Map<Integer, String> versesMap;

    static {
        versesMap = new HashMap<>();
        versesMap.put(1, "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.");
        versesMap.put(2, "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.");
        versesMap.put(3, "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        versesMap.put(4, "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        versesMap.put(5, "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        versesMap.put(6, "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        versesMap.put(7, "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        versesMap.put(8, "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        versesMap.put(9, "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        versesMap.put(10, "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        versesMap.put(11, "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
        versesMap.put(12, "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.");
    }

    String verse(int verseNumber) {
        return versesMap.get(verseNumber)+"\n";
    }

    String verses(int startVerse, int endVerse) {
        String finalVerse = "";

        for(int i=startVerse; i <= endVerse; i++) {
            if(i == endVerse) {
                finalVerse += versesMap.get(i) + "\n";
            } else {
                finalVerse += versesMap.get(i) + "\n\n";
            }
        }

        return finalVerse;
    }
    
    String sing() {
        String completeVerse = "";

        for(int i=1; i <= 12; i++) {
            if(i == 12) {
                completeVerse += versesMap.get(i) + "\n";
            } else {
                completeVerse += versesMap.get(i) + "\n\n";
            }
        }

        return completeVerse;
    }
}
