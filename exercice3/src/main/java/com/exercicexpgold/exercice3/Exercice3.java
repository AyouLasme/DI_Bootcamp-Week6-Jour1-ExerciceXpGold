/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexpgold.exercice3;



public class Exercice3 {

    public static void main(String[] args) {
        
    Student student1 = new Student();
    student1.displayStudentInfo();

    Student student2 = new Student("Mia Mi", 17);
    student2.displayStudentInfo();

    Student student3 = new Student("Liam L", 15, "Computer Science", 'B');
    student3.displayStudentInfo();
    
    }
}
