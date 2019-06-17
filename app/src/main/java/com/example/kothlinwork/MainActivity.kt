package com.example.kothlinwork

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { Toast.makeText(this,"moving to next activity",LENGTH_LONG).show()

           intent = Intent(applicationContext, androidkot::class.java)
           startActivity(intent)
       }}}

//        println("for colllections ******IMMUTABLE********* ")
//        collec();
//        println("for colllections ******MUTABLE********* ")
//        collecM();
//        println("for normal funcytion using predefined function and user defined function")
//
//roots(25)
//println(" by using recursive function")
//        recc(2)
//      l`  println("by using tailrecursibve function")
//        tailrec(5,1)
//println("using lambda function")
//        val myLambda: (Int) -> Unit= {s: Int -> println(s) }
//        println("using lambda function with higher order")
//        addNumber(5,10,myLambda)
//println("*********************")
//println("STRING")
//        nam()
//        println("*********************")
//        println("Exception")
//        excc()
//        println("declare variables and print")
//        var str: String = "Hello, students!"
//        val age: Int = 23
//
//        println(str)
//        println("What's up?")
//        print(age)
//
      //  println("******************")
//***********************************
  //     println("using when")
  //     var a = 1;
  //     when (a) {
  //         1 -> println("value of a is 1");
  //         2 -> println("value is 2");
  //
  //     }
  //     //***************
  //
  //     println("*************************");
  //     println("using while loop")
  //     var i = 0;
  //     while (i < 5) {
  //         println(i)
  //         i++
  //
  //     }
  //     println("using if else")
  //     if (i == 4) {
  //         println("final value is 4");
  //     } else {
  //         println("final value is 5");
  //     }
  //     //*******************************
  //     println("printing array in for loop using arrayof libarary")
  //     val marks = arrayOf(80, 85, 60, 90, 70)
  //     for (item in marks) {
  //         println(item)
  //
  //     }
  //     println("printing array in for loop using constructor")
  //     val asc = Array(5, { i -> i * 2 })
  //     for (i in 0..4) {
  //         println(asc[i]);
  //     }
  //
  //     println("********* ")
  //     print("for (i in 1..5) print(i) = ")
  //     for (i in 1..5) print(i)
  //     println()
  //     println("********* ")
  //     print("using continue")
  //     for (i in asc) {
  //         if (i == 4)
  //             continue;
  //         print(i)
  //
  //     }
  //     //*****************
  //     println("for using break in the same")
  //     for (i in 1..5) {
  //         print(i)
  //         if (i == 3)
  //             break;
  //     }
  //
  //


//
//
//  fun recc(  count:Int=2) {
//
//
//
//      if (count <= 5) {
//          println(count);
//
//          recc(count+1);
//      }
//  }
//
//
//  fun tailrec(num:Int,root:Int)
//  {
//    if(num==1) {
//        println(root);
//    }else{
//        tailrec(num-1,root*num)}
//
//    }
//
//
//
//
//  fun roots(number:Int):Double {
//      var result = Math.sqrt(number.toDouble())
//      println(result)
//      return result
//  }
//
//  fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit ){   //high level function lambda as parameter
//      val add = a + b
//      mylambda(add) // println(add)
//  }
//**************************************************************************************
//  //**************************************************************************************
//  //**************************************************************************************
//  //for every thing realted to sring array and exception
//fun nam()
//{ println("declaring string")
//    var st="fjnfkjnfkdl"
//    println(st[5])
//    println(st.length)
//    print("for eascape character")
//    println("\n")
//    print("nextLine")
//    println("using raw with and without trim")
//    println(""" hejkkx
//        |nfkdnk
//        |nfkdnkf
//    """.trimMargin())
//    println(""" hejkkx
//        |nfkdnk
//        |nfkdnkf
//    """)
//
//}
//
//    //**************************************************************************************
//    //**************************************************************************************
//    //**************************************************************************************
//    //for exception
//fun excc(){
//        var arr=arrayOf(1,2,1,4,6,6)
//        println("exception using try and catch")
//        try {
//            var a=10
//            var b=0
//            a=a/b;
//            arr.set(7,0)
//
//        }
//        catch (e : StringIndexOutOfBoundsException){
//            println(e)
//            Log.d("", "$e")
//        }
//        catch (e : ArithmeticException){
//            println(e)
//        }
//    }
//fun collec()
//{
//    var myArray = Array<Int>(5){0}
//    var myArray1 = arrayOf(1,10,4,6,15)
//
//    println("IMMUTABLE")
//    println("immutable-listOf")
//    var list = listOf("Ajay","Vijay","Prakash")
//    println("immutable-mapOf")
//    val myMap = mapOf<Int,String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")
//
//    println(myMap.getValue(4))
//    println("immutable-display map")
//    for(key in myMap.keys){
//        println("Element at key $key = ${myMap.get(key)}")
//    }
//    println("immutable- using minus")
//    for(m in myMap.minus(4)){
//        println(myMap[m.key])
//    }
//    println("immutable-using plus")
//    for(p in myMap.plus(Pair(5, "Rohan"))) {
//        println("Element at key ${p.key} = ${p.value}")
//    }
//    println("immutable-using set")
//
//        val mySet: Set<Any> = setOf(2,6,4,29,4,5,"Ashu","Ajay")
//        println(".......print Int set.........")
//        for(element in mySet){
//            println(element)
//
//            println("...mySet.contains\"Ashu\"...")
//            println(mySet.contains("Ashu"))
//            println(mySet.drop(2))
//        }
//}
//fun collecM()
//{
//    println("Mutable- mutableList************")
//    var mutableList = mutableListOf("Ajay","Vijay","Prakash","Vijay")
//    for(element in mutableList){
//        println(element)
//    }
//    println("adding elements")
//    mutableList.add("a")
//    mutableList.add("ab")
//    for(element in mutableList){
//        println(element)
//    }
//    println("Mutable-arrayList************")
//
//    val arrayList: ArrayList<String> = ArrayList<String>(5)
//
//    arrayList.add("Ajay")
//    arrayList.add("Vijay")
//    arrayList.add("Prakash")
//    arrayList.add("Rohan")
//    arrayList.add("Vijay")
//    println(".......print ArrayList.......")
//    for (i in arrayList) {
//        println(i)
//    }
//    println(".......arrayList.remove(3).......")
//    arrayList.removeAt(3)
//    for (i in arrayList) {
//        println(i)
//    }
//    println("added value")
//    arrayList.set(2,"Rohan")
//    println( arrayList.get(2))
//    println("clear array list")
//    arrayList.clear()
//
//    for (i in arrayList) {
//        println(i)
//    }
//    println("Mutable-hashMap*******************")
//    val hashMap:HashMap<Int,String> = HashMap<Int,String>()
//    hashMap.put(1,"Ajay")
//    hashMap.put(3,"Vijay")
//    hashMap.put(4,"Prakash")
//    hashMap.put(2,"Rohan")
//
//    println(".....traversing hashmap.......")
//    for(key in hashMap.keys){
//        println("Element at key $key = ${hashMap[key]}")
//    }
//print("hashmap contains 3 key??")
//    println(hashMap.containsKey(3))
//    print("hashmap to put value and key")
//    hashMap.put(2,"Raj")
//    print("hashmap contains delhi value??")
//    println(hashMap.containsValue("Delhi"))
//    print("hashmap final ")
//    for(key in hashMap.keys){
//        println("Element at key $key = ${hashMap[key]}")
//    }
//    print("Mutable-set ****************************8")
//    val intmutableSet = mutableSetOf<Int>(2, 6, 4, 29, 4, 5)
//    val mutableSet: MutableSet<Int> = mutableSetOf<Int>(6,8,11,22)
//
//    println("....intmutableSet....")
//    for(element in intmutableSet){
//        println(element)
//    }
//    println("....Hashset....")
//    var hashSet = HashSet<Int>(3)
//    val intSet = setOf(6,4,29)
//    hashSet.add(2)
//    hashSet.add(13)
//    hashSet.add(6)
//    hashSet.add(5)
//    hashSet.add(2)
//    hashSet.add(8)
//    println("traversing hashSet")
//    for (element in hashSet){
//        println(element)
//    }
//}}
//
//
//
//
//
//