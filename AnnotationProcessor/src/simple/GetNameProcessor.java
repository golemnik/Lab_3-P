package simple;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes("annotation.GetName")
@SupportedSourceVersion(SourceVersion.RELEASE_11)
public class GetNameProcessor extends AbstractProcessor {
    private Messager messanger;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        messanger = processingEnv.getMessager();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        for (TypeElement annotation : annotations) {
            Set<? extends Element> annotatedElements = env.getElementsAnnotatedWith(annotation);
            for (Element annotatedElement : annotatedElements) {
                messanger.printMessage(Diagnostic.Kind.OTHER, annotatedElement.getSimpleName());
            }
        }
        return true;
    }
}
