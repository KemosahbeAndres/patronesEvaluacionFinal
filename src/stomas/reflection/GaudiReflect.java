package stomas.reflection;

import stomas.gaudi.Autor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class GaudiReflect {
    @Override
    public String toString()
    {
        String output = "";
        Autor autor = new Autor("", "", "", "");
        Class clase = autor.getClass();
        String acceso = "";
        switch(clase.getModifiers()){
            case 1:
                acceso = "Publico";
                break;
            case 2:
                acceso = "Privado";
                break;
            case 4:
                acceso = "Protegido";
                break;
            default:
                acceso = "Por defecto";
        }
        output += "\n1. Evaluacion Unidad 3 - Reflection" +
                "\n------------------" +
                "\nClase: " + clase.getSimpleName() +
                "\nPadre: " + clase.getSuperclass().getSimpleName() +
                "\nAcceso: " + acceso +
                "\n------------------";
        //Contructor
        Constructor[] constructor = clase.getDeclaredConstructors();
        Parameter[] params = constructor[0].getParameters();
        output += "\nConstructor" +
                "\n------------------" +
                "\nNombre: " + constructor[0].getName() +
                "\nParametros:";
        for(Parameter p : params){
            output += "\n## Parametro '" + p.getName() + "'" +
                    "\n## Tipo: " + p.getType().getSimpleName();
        }
        output += "\n------------------";
        // Atributos
        Field[] campos = clase.getDeclaredFields();
        output += "\nAtributos" +
                "\n------------------";
        for(Field f : campos){
            String modificador = "";
            switch(f.getModifiers()){
                case 1:
                    modificador = "Publico";
                    break;
                case 2:
                    modificador = "Privado";
                    break;
                case 4:
                    modificador = "Protegido";
                    break;
                default:
                    modificador = "Por defecto";
            }
            output += "\nAtributo '" + f.getName() + "'" +
                    "\n## Tipo: " + f.getType().getSimpleName() +
                    "\n## Acceso: " + modificador +
                    "\n--";

        }
        if(campos.length <= 0){
            output += "\nNo se encontraron atributos!";
        }
        output += "\n------------------";

        // Metodos
        Method[] metodos = clase.getDeclaredMethods();
        output += "\nMetodos" +
                "\n------------------";
        for(Method m : metodos){
            output += "\nNombre: " + m.getName() +
                    "\n##Tipo: " + m.getAnnotatedReturnType().toString();
        }
        if(metodos.length <= 0){
            output += "\nNo se encontraron metodos!";
        }
        output += "\n------------------";
        return output;
    }

    public static void main(String[] args) {
        System.out.println(new GaudiReflect());
    }
}
