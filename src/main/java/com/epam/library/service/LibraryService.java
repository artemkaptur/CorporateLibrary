package com.epam.library.service;

import com.epam.library.domain.Report;

public interface LibraryService {

	Report getReport(int moreThen, int lessThen);

}
