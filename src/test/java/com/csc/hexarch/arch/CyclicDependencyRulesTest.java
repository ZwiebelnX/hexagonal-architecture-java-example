package com.csc.hexarch.arch;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.dependencies.SlicesRuleDefinition.slices;

@AnalyzeClasses(packages = "com.csc.hexarch", importOptions = ImportOption.DoNotIncludeTests.class)
public class CyclicDependencyRulesTest {

    @ArchTest
    static final ArchRule no_cycles_by_method_calls_between_slices =
            slices().matching("com.csc.hexarch.(*)..").should().beFreeOfCycles();


}