/*Metodo de integración númerica Simpson*/

//Función de tipo Double que devuelve un double
def integracion(f:Double => Double, a:Int, b:Int): Double = {
    val h =(a+b)/2.0
    (b-a)*(f(a)+ (4*f(h))+ f(b))/6
}

//función math.pow es para obtener la potencia
//función math.exp es para obtener la función de e
//función math.sqrt es para obtener la raíz cuadrada
val funcion1: (Double)=> Double =(x:Double) => -math.pow(x,2)+(8*x)-12
val funcion2: (Double)=> Double=(x:Double) => 3*math.pow(x,2)
val funcion3: (Double)=> Double=(x:Double) => x + (2*math.pow(x,2))-math.pow(x,3)+ (5*math.pow(x,4))
val funcion4: (Double)=> Double=(x:Double) => ((2*x)+1)/(math.pow(x,2)+x)
val funcion5: (Double)=> Double=(x:Double) => math.exp(x)
val funcion6: (Double)=> Double=(x:Double) => 1 / math.sqrt(x-1)
val funcion7: (Double)=> Double=(x:Double) => 1/ (1+math.pow(x,2))

val valor_f1 = integracion(funcion1,3,5)
val valor_f2 = integracion(funcion2,0,2)
val valor_f3 = integracion(funcion3,-1,1)
val valor_f4 = integracion(funcion4,1,2)
val valor_f5 = integracion(funcion5,0,1)
val valor_f6 = integracion(funcion6,2,3)
val valor_f7 = integracion(funcion7,0,1)

//función math.abs sirve para obtener el valor absoluto
def error_aproximacion(v_esperado: Double, x: Double): Double = math.abs(v_esperado - x)

error_aproximacion(v_esperado = 7.33,valor_f1)
error_aproximacion(v_esperado = 8.0,valor_f2)
error_aproximacion(v_esperado = 3.333,valor_f3)
error_aproximacion(v_esperado = 1.09861,valor_f4)
error_aproximacion(v_esperado = 1.71828,valor_f5)
error_aproximacion(v_esperado = 0.828427,valor_f6)
error_aproximacion(v_esperado = 0.785398,valor_f7)
