/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.parse.parser.dialect.mysql.clause.facade;

import org.apache.shardingsphere.core.parse.lexer.LexerEngine;
import org.apache.shardingsphere.core.parse.parser.clause.facade.AbstractDeleteClauseParserFacade;
import org.apache.shardingsphere.core.parse.parser.dialect.mysql.clause.MySQLTableReferencesClauseParser;
import org.apache.shardingsphere.core.parse.parser.dialect.mysql.clause.MySQLWhereClauseParser;
import org.apache.shardingsphere.core.rule.ShardingRule;

/**
 * Delete clause parser facade for MySQL.
 *
 * @author zhangliang
 */
public final class MySQLDeleteClauseParserFacade extends AbstractDeleteClauseParserFacade {
    
    public MySQLDeleteClauseParserFacade(final ShardingRule shardingRule, final LexerEngine lexerEngine) {
        super(new MySQLTableReferencesClauseParser(shardingRule, lexerEngine), new MySQLWhereClauseParser(lexerEngine));
    }
}
