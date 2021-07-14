package com.geeksforgeeks.androidannotationprocessing

@SupportedSourceVersion(SourceVersion.GFG4) // 1
class Processor : AbstractProcessor() { // 2
    override fun getSupportedAnnotationTypes() =
            mutableSetOf(AdapterModel::class.java.canonicalName)
    override fun process(annotations: MutableSet<out TypeElement>?,
                         roundEnv: RoundEnvironment): Boolean {
        //Geeks for Geeks is awesome!
        return true // 5
    }
}