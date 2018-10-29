/*
 * NAMA     : Syahrifal Dani
 * Kelas    : IF - 3
 * NIM      : 10117093
 * Deskripsi Program  : Program ini berisi program untuk menampilkan pekenalan 
 * Karakter akatuski
 */
package pbo3.pkg10117093.latihan60.akatsukin;

/**
 *
 * @author Syahrifal
 */
public class Member extends Akatsuki {
    private String name;
    private String fromCountry;
    private String weapon;
    private String character_type;
    private String speciality;
    private String death;
    private boolean havePartner;

    public Member(String name, String fromCountry, String weapon, String character_type, String speciality, String death, boolean havePartner, String clothes, String goals) {
        super(clothes, goals);
        this.name = name;
        this.fromCountry = fromCountry;
        this.weapon = weapon;
        this.character_type = character_type;
        this.speciality = speciality;
        this.death = death;
        this.havePartner = havePartner;
    }
    
    public String getName() {
        return name;
    }
    
    public String getWeapon() {
        return weapon;
    }

    public String getCharacter_type() {
        return character_type;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getDeath() {
        return death;
    }

    public boolean isHavePartner() {
        return havePartner;
    }
    
    public void displayMember() {
        System.out.println("-------------------");
        System.out.println("Name : " + name);
        System.out.println("-------------------");
        System.out.println("From : " + fromCountry);
        System.out.println("Weapon : " + weapon);
        System.out.println("Character Type : " + character_type);
        System.out.println("Speciality : " + speciality);
        System.out.println("Death : " + death);
        if(isHavePartner()) {
            System.out.println("Mission Type : Team");
        } else {
            System.out.println("Mission Type : Solo");
        }
        System.out.println();
    }
}
    

