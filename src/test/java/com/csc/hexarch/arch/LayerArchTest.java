package com.csc.hexarch.arch;


import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "com.csc.hexarch", importOptions = ImportOption.DoNotIncludeTests.class)
class LayerArchTest {

    @ArchTest
    static ArchRule layer_dependencies_are_respected = layeredArchitecture()
            .layer("Inbound").definedBy("com.csc.hexarch.adapter.inbound..")
            .layer("Application").definedBy("com.csc.hexarch.application..")
            .layer("Domain").definedBy("com.csc.hexarch.application.domain..")
            .layer("Outbound").definedBy("com.csc.hexarch.adapter.outbound..")

            .whereLayer("Inbound").mayNotBeAccessedByAnyLayer()
            .whereLayer("Outbound").mayNotBeAccessedByAnyLayer()
            .whereLayer("Application").mayOnlyBeAccessedByLayers("Inbound", "Outbound")
            .whereLayer("Domain").mayOnlyBeAccessedByLayers("Application", "Outbound", "Inbound");
}
