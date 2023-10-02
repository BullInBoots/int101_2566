/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package int101.homework01.work04;

/**
 *
 * @author boolin
 */
public class Person {
    
    private int id;
    
    public Person(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Person(" + this.id + ")";
    }
}
