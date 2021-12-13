package com.example.scientificcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {
    lateinit var primaryTV: TextView
    lateinit var secondaryTV: TextView
    lateinit var ac:Button
    lateinit var c:Button
    lateinit var ob:Button
    lateinit var cb:Button
    lateinit var sin:Button
    lateinit var cos:Button
    lateinit var tan:Button
    lateinit var log:Button
    lateinit var ln:Button
    lateinit var fact:Button
    lateinit var squaree:Button
    lateinit var root:Button
    lateinit var inv:Button
    lateinit var div:Button
    lateinit var btn7:Button
    lateinit var btn8:Button
    lateinit var btn9:Button
    lateinit var mult:Button
    lateinit var btn4:Button
    lateinit var btn5:Button
    lateinit var btn6:Button
    lateinit var minus:Button
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var plus:Button
    lateinit var pi:Button
    lateinit var btn0:Button
    lateinit var dot:Button
    lateinit var equal:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        primaryTV= findViewById(R.id.idTVPrimary)
        secondaryTV=findViewById(R.id.idTVSecondary)
        ac=findViewById(R.id.ac)
        c=findViewById(R.id.c)
        ob=findViewById(R.id.ob)
        cb=findViewById(R.id.cb)
        sin=findViewById(R.id.sin)
        cos=findViewById(R.id.cos)
        tan=findViewById(R.id.tan)
        log=findViewById(R.id.log)
        ln=findViewById(R.id.ln)
        fact=findViewById(R.id.fact)
        squaree=findViewById(R.id.squaree)
        root=findViewById(R.id.root)
        inv=findViewById(R.id.inv)
        div=findViewById(R.id.div)
        btn7=findViewById(R.id.seven)
        btn8=findViewById(R.id.eight)
        btn9=findViewById(R.id.nine)
        mult=findViewById(R.id.mult)
        btn4=findViewById(R.id.four)
        btn5=findViewById(R.id.five)
        btn6=findViewById(R.id.six)
        minus=findViewById(R.id.minus)
        btn1=findViewById(R.id.one)
        btn2=findViewById(R.id.two)
        btn3=findViewById(R.id.three)
        plus=findViewById(R.id.plus)
        pi=findViewById(R.id.pi)
        btn0=findViewById(R.id.zero)
        dot=findViewById(R.id.dot)
        equal=findViewById(R.id.equal)


        btn0.setOnClickListener {
            primaryTV.text= (primaryTV.text.toString()+"0")
        }
        btn1.setOnClickListener {
            primaryTV.text= (primaryTV.text.toString()+"1")
        }
        btn2.setOnClickListener {
            primaryTV.text= (primaryTV.text.toString()+"2")
        }
        btn3.setOnClickListener {
            primaryTV.text= (primaryTV.text.toString()+"3")
        }
        btn4.setOnClickListener {
            primaryTV.text= (primaryTV.text.toString()+"4")
        }
        btn5.setOnClickListener {
            primaryTV.text= (primaryTV.text.toString()+"5")
        }
        btn6.setOnClickListener {
            primaryTV.text= (primaryTV.text.toString()+"6")
        }
        btn7.setOnClickListener {
            primaryTV.text= (primaryTV.text.toString()+"7")
        }
        btn8.setOnClickListener {
            primaryTV.text= (primaryTV.text.toString()+"8")
        }
        btn9.setOnClickListener {
            primaryTV.text= (primaryTV.text.toString()+"9")
        }
        dot.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+".")
        }
        plus.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"+")
        }
        div.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"/")
        }
        ob.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"(")
        }
        cb.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+")")
        }
        pi.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"3.142")
            secondaryTV.text=(pi.text.toString())
        }
        sin.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"sin")
        }
        cos.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"cos")
        }
        tan.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"tan")
        }
        inv.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"^"+"(-1)")
        }
        ln.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"ln")
        }
        log.setOnClickListener {
            primaryTV.text=(primaryTV.text.toString()+"log")
        }

        minus.setOnClickListener {
            val str: String = primaryTV.text.toString()
            if(!str.get(index=str.length-1).equals("-")){
                primaryTV.text= (primaryTV.text.toString()+"-")
            }
        }
        mult.setOnClickListener {
            val str: String = primaryTV.text.toString()
            if(!str.get(index = str.length-1).equals("*")){
                primaryTV.text= (primaryTV.text.toString()+"*")
            }
        }

        root.setOnClickListener {
            if(primaryTV.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
            else{
                val str: String= primaryTV.text.toString()
                val r=Math.sqrt(str.toDouble())
                val result =r.toString()
                primaryTV.text=result
            }
        }

        ac.setOnClickListener {
            primaryTV.text=""
            secondaryTV.text=""
        }

        c.setOnClickListener {
            var str: String=primaryTV.text.toString()
            if(!str.equals("")){
                str=str.substring(0,str.length-1)
                primaryTV.text=str
            }
        }

        squaree.setOnClickListener {
            if(primaryTV.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
            else{
                val d:Double= primaryTV.text.toString().toDouble()
                val squaree= d*d
                primaryTV.text= squaree.toString()
                secondaryTV.text= squaree.toString()
            }
        }

        fact.setOnClickListener {
            if(primaryTV.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
            else{
                val value:Int=primaryTV.text.toString().toInt()
                val fact:Int=factorial(value)
                primaryTV.text=fact.toString()
                secondaryTV.text=fact.toString()
            }
        }

        equal.setOnClickListener {
            val str:String=primaryTV.text.toString()
            val result:Double = evaluate(str)
            val r=result.toString()
            primaryTV.text=r
            secondaryTV.text=str
        }

    }

    fun factorial(n: Int): Int {
        return  if((n==1 || n==0))1; else n*factorial(n-1)
    }

    fun evaluate(str:String):Double{
        return object:Any() {
            var pos = -1
            var ch = 0

            fun nextChar() {
                ch = if (++pos < str.length) str[pos].toInt() else -1
            }

            fun eat(charToEdt: Int): Boolean {
                while (ch == ' '.toInt()) nextChar()

                if (ch == charToEdt) {
                    nextChar()
                    return true
                }
                return false
            }

            fun parse(): Double {
                nextChar()
                val x = parseExpression()
                if (pos < str.length) throw RuntimeException("Unexepxted: " + ch.toChar())
                return x
            }

            fun parseExpression(): Double {
                var x = parseTerm()
                while (true) {
                    if (eat('+'.toInt())) x += parseTerm()
                    else if (eat('-'.toInt())) x -= parseTerm()
                    else return x
                }

            }

            fun parseTerm(): Double {
                var x = parseFactor()
                while (true) {
                    if (eat('*'.toInt())) x *= parseFactor()
                    else if (eat('/'.toInt())) x /= parseFactor()
                    else return x
                }
            }

            fun parseFactor(): Double {
                if (eat('+'.toInt())) return parseFactor()
                if (eat('-'.toInt())) return -parseFactor()

                var x: Double
                val startPos = pos

                if (eat('('.toInt())) {
                    x = parseExpression()
                    eat(')'.toInt())
                } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                    while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()

                    x = str.substring(startPos, pos).toDouble()
                } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                    while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                    val func = str.substring(startPos, pos)
                    x = parseFactor()
                    if (func == "sqrt"){
                        x=Math.sqrt(x)
                    }
                    else if(func =="sin"){
                        x=Math.sin(Math.toRadians(x))
                    }
                    else if(func =="cos"){
                        x=Math.cos(Math.toRadians(x))
                    }
                    else if(func =="tan"){
                        x=Math.tan(Math.toRadians(x))
                    }
                    else if(func == "log"){
                        x=Math.log10(x)
                    }
                    else if(func == "ln"){
                        x=Math.log(x)
                    }


                } else {
                    throw RuntimeException("Unexpected :" + ch.toChar())
                }
                if (eat('^'.toInt())) x = Math.pow(x, parseFactor())
                return x
            }
        }.parse()
    }

}