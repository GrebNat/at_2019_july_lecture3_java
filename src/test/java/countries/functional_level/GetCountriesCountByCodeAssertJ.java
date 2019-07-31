package countries.functional_level;

import countries.dto.CountryDto;
import countries.service.RestCountriesSteps;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GetCountriesCountByCodeAssertJ {


	@Test(description = "Get country by one Code")
	void getCountryByTwoCode2() {
		String countryCode = "rus;nor";

		CountryDto[] countries = new RestCountriesSteps()
				.getCountryByCode(countryCode);

		assertThat(countries)
				.isEmpty();

	/*	assertThat(countries)
				.isEmpty();*/
	}

}
