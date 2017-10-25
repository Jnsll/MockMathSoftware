package fr.istic.vv.afe;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.Translator;

public class Profiler implements Translator{
    public static void addInstrumentation(CtClass ctClass, CtMethod ctMethod) {
        try {
            ctMethod.insertBefore("System.out.println(\""+ctMethod.getLongName()+"\");");
        } catch (CannotCompileException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void onLoad(ClassPool pool, String classname) throws NotFoundException, CannotCompileException {
        CtClass ctClass = pool.get(classname);
        // On itère sur toutes les méthodes déclarées de la classe
        for (CtMethod ctMethod:ctClass.getDeclaredMethods()) {
            // On évite de chercher à modifier des méthodes natives ;-)
            if (!Modifier.isNative(ctMethod.getModifiers())) {
                addInstrumentation(ctClass, ctMethod);
            }
        }
    }

    // Cette méthode est laissée vide, elle ne nous sert à rien
    public void start(ClassPool arg0) throws NotFoundException, CannotCompileException { }

}