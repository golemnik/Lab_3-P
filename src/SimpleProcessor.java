import object.Obj;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes("TestField")
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class SimpleProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env, Object obj) {
        annotations.forEach(annotation -> {
            Set<? extends Element> elements = env.getElementsAnnotatedWith(annotation);
            typeElementClass = TypeElement.class;
            elements.stream()
                    .filter(typeElementClass.isInstance(obj))
                    .map(TypeElement.class::cast)
                    .map(TypeElement::getQualifiedName)
                    .map(name -> "field " + name + " is annotated with " + annotation.getQualifiedName())
                    .forEach(System.out::println);
        });
        return true;
    }
}
