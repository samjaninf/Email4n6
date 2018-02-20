/*
 * This file is part of Email4n6.
 * Copyright (C) 2018  Marten4n6
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.email4n6.model.report;

import com.github.email4n6.message.factory.MessageFactory;
import com.github.email4n6.model.casedao.Case;
import com.github.email4n6.model.tagsdao.TagsDAO;
import com.github.email4n6.view.tabs.bookmarks.BookmarksModel;
import lombok.Builder;
import lombok.Getter;

import java.io.File;

/**
 * Configuration options used when creating a report.
 *
 * @author Marten4n6
 */
@Builder
public class ReportConfiguration {

    private @Getter Case currentCase;
    private @Getter String reportName;
    private @Getter File outputFolder;
    private @Getter BookmarksModel bookmarksModel;
    private @Getter TagsDAO tagsDAO;
    private @Getter MessageFactory messageFactory;
}