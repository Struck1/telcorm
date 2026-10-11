package com.telcocrm.customerservice.architecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = LayerDependencyTest.BASE_PACKAGE, importOptions = ImportOption.DoNotIncludeTests.class)
class LayerDependencyTest {

    static final String BASE_PACKAGE = "com.telcocrm.customerservice";

    private static final String DOMAIN = BASE_PACKAGE + ".domain..";
    private static final String APPLICATION = BASE_PACKAGE + ".application..";
    private static final String PERSISTENCE = BASE_PACKAGE + ".persistence..";
    private static final String INFRASTRUCTURE = BASE_PACKAGE + ".infrastructure..";
    private static final String WEBAPI = BASE_PACKAGE + ".webapi..";

    // Some layers do not contain classes yet, so empty rule subjects must not fail the build.

    @ArchTest
    static final ArchRule domainMustNotDependOnOtherLayers = noClasses()
            .that().resideInAPackage(DOMAIN)
            .should().dependOnClassesThat().resideInAnyPackage(APPLICATION, PERSISTENCE, INFRASTRUCTURE, WEBAPI)
            .allowEmptyShould(true);

    @ArchTest
    static final ArchRule applicationMustNotDependOnOuterLayers = noClasses()
            .that().resideInAPackage(APPLICATION)
            .should().dependOnClassesThat().resideInAnyPackage(PERSISTENCE, INFRASTRUCTURE, WEBAPI)
            .allowEmptyShould(true);

    @ArchTest
    static final ArchRule noLayerMayDependOnWebapi = noClasses()
            .that().resideInAnyPackage(DOMAIN, APPLICATION, PERSISTENCE, INFRASTRUCTURE)
            .should().dependOnClassesThat().resideInAPackage(WEBAPI)
            .allowEmptyShould(true);
}
