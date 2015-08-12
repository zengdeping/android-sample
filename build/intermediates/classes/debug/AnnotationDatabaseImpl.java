
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import com.google.inject.AnnotationDatabase;
import roboguice.fragment.FragmentUtil;

public class AnnotationDatabaseImpl extends AnnotationDatabase {

    public void fillAnnotationClassesAndFieldsNames(HashMap<String, Map<String, Set<String>>> mapAnnotationToMapClassWithInjectionNameToFieldSet) {
    
        String annotationClassName = null;
        Map<String, Set<String>> mapClassWithInjectionNameToFieldSet = null;
        Set<String> fieldNameSet = null;


        annotationClassName = "com.google.inject.Inject";
        mapClassWithInjectionNameToFieldSet = mapAnnotationToMapClassWithInjectionNameToFieldSet.get(annotationClassName);
        if( mapClassWithInjectionNameToFieldSet == null ) {
            mapClassWithInjectionNameToFieldSet = new HashMap<String, Set<String>>();
            mapAnnotationToMapClassWithInjectionNameToFieldSet.put(annotationClassName, mapClassWithInjectionNameToFieldSet);
        }

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("notificationManager");
        fieldNameSet.add("vibrator");
        mapClassWithInjectionNameToFieldSet.put("com.meihua.roboguicetest.MainActivity", fieldNameSet);


        annotationClassName = "roboguice.inject.InjectView";
        mapClassWithInjectionNameToFieldSet = mapAnnotationToMapClassWithInjectionNameToFieldSet.get(annotationClassName);
        if( mapClassWithInjectionNameToFieldSet == null ) {
            mapClassWithInjectionNameToFieldSet = new HashMap<String, Set<String>>();
            mapAnnotationToMapClassWithInjectionNameToFieldSet.put(annotationClassName, mapClassWithInjectionNameToFieldSet);
        }

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("textView");
        mapClassWithInjectionNameToFieldSet.put("com.meihua.roboguicetest.MainActivity", fieldNameSet);


        annotationClassName = "roboguice.inject.InjectResource";
        mapClassWithInjectionNameToFieldSet = mapAnnotationToMapClassWithInjectionNameToFieldSet.get(annotationClassName);
        if( mapClassWithInjectionNameToFieldSet == null ) {
            mapClassWithInjectionNameToFieldSet = new HashMap<String, Set<String>>();
            mapAnnotationToMapClassWithInjectionNameToFieldSet.put(annotationClassName, mapClassWithInjectionNameToFieldSet);
        }

        fieldNameSet = new HashSet<String>();
        fieldNameSet.add("name");
        mapClassWithInjectionNameToFieldSet.put("com.meihua.roboguicetest.MainActivity", fieldNameSet);

    }
    
    public void fillAnnotationClassesAndMethods(HashMap<String, Map<String, Set<String>>> mapAnnotationToMapClassWithInjectionNameToMethodsSet) {
    }
    
    public void fillAnnotationClassesAndConstructors(HashMap<String, Map<String, Set<String>>> mapAnnotationToMapClassWithInjectionNameToConstructorsSet) {
    }
    
    public void fillClassesContainingInjectionPointSet(HashSet<String> classesContainingInjectionPointsSet) {
        classesContainingInjectionPointsSet.add("com.meihua.roboguicetest.MainActivity");
    }
    

    public void fillBindableClasses(HashSet<String> injectedClasses) {
        injectedClasses.add("android.widget.TextView");
        injectedClasses.add("android.app.NotificationManager");
        injectedClasses.add("java.lang.String");
        injectedClasses.add("android.os.Vibrator");

        if(FragmentUtil.hasNative) {
            injectedClasses.add("android.app.FragmentManager");
        }

        if(FragmentUtil.hasSupport) {
            injectedClasses.add("android.support.v4.app.FragmentManager");
        }
    }

}
