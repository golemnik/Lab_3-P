package simple;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import java.util.Set;


@SupportedAnnotationTypes("annotation.GetPublicThings")
@SupportedSourceVersion(SourceVersion.RELEASE_11)
public class GetPublicThingsProcessor extends AbstractProcessor {
    private Messager messanger;
    private Types typeUtils;


    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        messanger = processingEnv.getMessager();
        typeUtils = processingEnv.getTypeUtils();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        for (TypeElement annotation : annotations){
            Set <? extends Element> annotatedElements = env.getElementsAnnotatedWith(annotation);
            for (Element annotatedType : annotatedElements) {
                messanger.printMessage(Diagnostic.Kind.NOTE, processType((TypeElement) annotatedType));
            }
        }
        return true;
    }

    private String processType(TypeElement annotatedType) {
        String msg = "";
        boolean publicMembers = false;
        msg += annotatedType.getSimpleName()+"\n";
        msg += "----------\n";
        for (Element member : annotatedType.getEnclosedElements()) {
            if (member.getModifiers().contains(Modifier.PUBLIC)) {
                msg += member.getSimpleName()+"\n";
                publicMembers = true;
            }
        }
        if (!publicMembers) {
            msg += "no public members in this class\n";
        }
        msg += "^^^^^^^^\n";
        if (!annotatedType.getQualifiedName().contentEquals("java.lang.Object")) {
            msg += processType((TypeElement) typeUtils.asElement(annotatedType.getSuperclass()));
        }
        return msg;
    }
}


