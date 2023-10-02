package com.abd.mymasjid;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class MyMasjidApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void createApplicationModuleModel() {
		ApplicationModules modules = ApplicationModules.of(MyMasjidApplication.class);
		modules.forEach(System.out::println);
	}

	@Test
	void verifiesModularStructure() {
		ApplicationModules modules = ApplicationModules.of(MyMasjidApplication.class);
		modules.verify();
	}

	@Test
	void createModuleDocumentation() {
		ApplicationModules modules = ApplicationModules.of(MyMasjidApplication.class);
		new Documenter(modules)
				.writeDocumentation()
				.writeIndividualModulesAsPlantUml();
	}

}
