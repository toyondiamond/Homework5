public class Main {
    public static void main(String[] args) {
        //task1
        int age = 20;
        if (age >=18){
            System.out.println("С совершеннолетием!");
        }
        if (age <18)   {
            System.out.println("Тебе еще не стукнуло 18!");
        }

        //task2
        //часть 1
        int ageBaby = 8;
        if (ageBaby >=7){
            System.out.println("Ты ходишь в школу");
        }
        if (ageBaby < 7) {
            System.out.println("Ты не можешь ходить в школу");
        }
        //часть 2
        int adult = 19;
        if (adult >=18){
            System.out.println("Ты можешь поступать в унивеерситет");
        }
        if (adult < 18) {
            System.out.println("Ты не можешь поступать в университет");
        }
        //часть3
        int adult1 = 26;
        if (adult1 >=24){
            System.out.println("Тебе давно пора искать работу,тунеядец!!");
        }
        if (adult1 < 24) {
            System.out.println("Ты не можешь пока искать работу пока учишься в университете");
        }
        //task3
        int wagonCapacity = 102;
        if (wagonCapacity >60){
            System.out.println("Вагон полностью забит");
        }
        if (wagonCapacity <60) {
            System.out.println("В вагоне есть сидячие места");
        }
        //task6
        //часть1
        int Olya = 18;
        if (Olya >= 18){
            System.out.println("С совершеннолетием!");
        } else {
            System.out.println("Тебе еще не исполнлось 18!");
        }
        //часть2-1
        int Igor = 8;
        if (Igor >= 7){
            System.out.println("Игорь ходит в школу");
        } else {
            System.out.println("Игорю еще рано ходить в школу");
        }
        //часть2-2
        int Stas = 44;
        if (Stas >=18){
            System.out.println("Давно пора заканчивать универ!");
        } else {
            System.out.println("Тебе еще не исполнилось 18");
        }
        //часть2-3
        int ageMaster = 24;
        if (ageMaster >= 24){
            System.out.println("Пора искать первую работу!");
        } else {
            System.out.println("Сперва надо закончить универ!");
        }
        //часть3
        int wagonCapacityNew = 102;
        if (wagonCapacityNew >= 60){
            System.out.println("Сидячих мест больше нет");
        } else {
            System.out.println("Сидячие места есть в наличии");
        }
        //task3
        //3-1
        int person  = 30;
        if (person >=2 && person < 6) {
            System.out.println("Если возраст человека равен " + person + ", то ему нужно ходить в садик");
        } else {
            System.out.println( "Если возраст человека равен " + person + ", то ему не нужно ходить в садик");
        }
        int person1 = 17;
        if (person1 >= 7 &&  person1 <18){
            System.out.println( "Если возраст человека равен " + person1 + ", то ему нужно ходить в школу");
        } else {
            System.out.println("Если возраст человека равен " + person1 + ", то ему не нужно ходить на работу");
        }
        int person2 = 10;
        if (person2 >=18 && person2 < 24){
            System.out.println("Если возраст человека равен " + person2 +", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + person2 + ", то его место не в универе");
        }
        int person3 = 30;
        if (person3 >=24){
            System.out.println("Если возраст человека равен " + person3 + ", то ему пора на работу");
        } else {
            System.out.println("Если возраст человека равен " + person3 + ", то ему не надо работать");
        }
        //3-2
        int babyNoName = 3;
        if (babyNoName <=5){
            System.out.println("Если ребенку " + babyNoName + ", то ему нельзя кататься на аттракционе");
        }else {
            System.out.println("Если ребенку равно " + babyNoName + "то ему можно пройти на аттракцион");
        }
        int babyNoName2 = 15;
        if (babyNoName2 >=5 && babyNoName2 < 14){
            System.out.println("Если ребенку равно " + babyNoName2 + ", то ему нельзя кататься без сопровождения");
        } else {
            System.out.println("Если ребенку " + babyNoName2 + ", то ему можно кататься одному" );
        }
        int babyNoName3 = 21;
        if (babyNoName3 >=14){
            System.out.println("Если ребенку " + babyNoName3 + ", то ему можно кататься одному" );
        } else {
            System.out.println("Если ребенку " + babyNoName3 + ", то ему нельзя кататься без сопровождения");
        }
        //3-3
        int one = 1;
        int two = 2;
        int free = 3;
        if (one <two && two > one && free>two){
            System.out.println("Большее число составляет " + free);
        } else {
            System.out.println(one + two + "небольшие числа");
        }
    }
}