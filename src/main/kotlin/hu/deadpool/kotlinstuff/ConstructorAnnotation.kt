package hu.deadpool.kotlinstuff

// TODO Annotation definition
@Target(AnnotationTarget.VALUE_PARAMETER,
        AnnotationTarget.PROPERTY,
        AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.PROPERTY_SETTER,
        AnnotationTarget.FIELD)
@Retention(AnnotationRetention.SOURCE)
annotation class WhereDoIPootis


// TODO parameter annotation
class ConstructorParamAnnotation(@WhereDoIPootis val exampleText: String)


// TODO use-site target demonstration
class AnnotationExamples(exampleText: String) {

    @WhereDoIPootis
    val exampleProperty: String = exampleText

    val propertyWithGetter: String
        @WhereDoIPootis get() {
            return "Test"
        }

    var propertyWithSetter: String = ""
        @WhereDoIPootis set(value) {
            field = value
        }
}

/*
    If you don't specify a use-site target,
    the target is chosen according to the @Target
    annotation of the annotation being used.
    If there are multiple applicable targets,
    the first applicable target from the following list is used:

    param;
    property;
    field.
*/
