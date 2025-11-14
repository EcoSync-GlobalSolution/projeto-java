INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Instituto Cidadania Ativa', 'ONG', 'contato@cidadaniaativa.org', 'S', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Universidade Paulista do Futuro', 'UNIVERSIDADE', 'parcerias@upf.edu.br', 'S', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('GreenCorp Sustentabilidade', 'EMPRESA', 'esg@greencorp.com.br', 'S', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Prefeitura de São Paulo - Sec. Assistência Social', 'PREFEITURA', 'projetos@socio.sp.gov.br', 'S', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Fundação Pró-Saúde Mental', 'ONG', 'gestao@prosaude.org', 'N', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Tech4All Brasil', 'EMPRESA', 'contato@tech4all.com.br', 'S', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Universidade Federal do Sudeste', 'UNIVERSIDADE', 'extensao@ufse.edu.br', 'S', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Movimento Educação Acessível', 'ONG', 'parcerias@educacessivel.org', 'N', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Prefeitura de Guarulhos - Meio Ambiente', 'PREFEITURA', 'meioambiente@guarulhos.sp.gov.br', 'S', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('NovaEnergia S.A.', 'EMPRESA', 'esg@novaenergia.com', 'S', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Futuro Digital Institute', 'ONG', 'contato@fdi.org.br', 'N', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Universidade Metropolitana', 'UNIVERSIDADE', 'relacoes@umetro.edu.br', 'S', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Prefeitura de Campinas - Inovação', 'PREFEITURA', 'inovacao@campinas.sp.gov.br', 'S', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Impacto Verde LTDA', 'EMPRESA', 'contato@impactoverde.com', 'N', SYSTIMESTAMP);
INSERT INTO ES_organizacao (nm_organizacao, tp_organizacao, nm_email_contato, st_verificada, dt_criacao) VALUES
('Rede Solidária Mulher', 'ONG', 'rs.mulher@solidaria.org', 'S', SYSTIMESTAMP);

INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Ana Pereira', 'ana.pereira@student.upf.edu.br', 'ESTUDANTE', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Bruno Santos', 'bruno.santos@student.ufse.edu.br', 'ESTUDANTE', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Carla Mendes', 'carla@cidadaniaativa.org', 'ONG', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Daniel Costa', 'daniel@greencorp.com.br', 'EMPRESA', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Eduardo Lima', 'eduardo.lima@student.umetro.edu.br', 'ESTUDANTE', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Fernanda Alves', 'fernanda@prosaude.org', 'ONG', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Gabriela Rocha', 'gabriela@tech4all.com.br', 'EMPRESA', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Henrique Souza', 'henrique.souza@upf.edu.br', 'UNIVERSIDADE', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Isabela Martins', 'isabela@educacessivel.org', 'ONG', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('João Vitor', 'joao.vitor@student.ufse.edu.br', 'ESTUDANTE', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Karen Oliveira', 'karen@novaenergia.com', 'EMPRESA', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Lucas Ferreira', 'lucas.ferreira@student.upf.edu.br', 'ESTUDANTE', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Mariana Gomes', 'mariana@fdi.org.br', 'ONG', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Nathalia Prado', 'nathalia@umetro.edu.br', 'UNIVERSIDADE', SYSTIMESTAMP);
INSERT INTO ES_usuario (nm_usuario, nm_email, tp_papel, dt_criacao) VALUES
('Otávio Ribeiro', 'otavio.ribeiro@student.umetro.edu.br', 'ESTUDANTE', SYSTIMESTAMP);

INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('React', 'TECNOLOGIA', 'Desenvolvimento front-end com React');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('TypeScript', 'TECNOLOGIA', 'Tipagem estática para JavaScript');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('Java', 'TECNOLOGIA', 'Desenvolvimento backend com Quarkus/Spring');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('SQL', 'TECNOLOGIA', 'Modelagem e consultas em BD relacional');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('Python', 'TECNOLOGIA', 'Scripts, automação e IA');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('UX Writing', 'GESTAO', 'Redação orientada à experiência do usuário');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('Gestão de Projetos', 'GESTAO', 'Planejamento e execução de projetos');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('Análise de Dados', 'TECNOLOGIA', 'Exploração e visualização de dados');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('Acessibilidade', 'SOCIAL', 'Boas práticas de acessibilidade digital');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('Coleta de Dados', 'GESTAO', 'Pesquisa e instrumentação de formulários');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('Comunicação', 'SOCIAL', 'Apresentações e comunicação interpessoal');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('ESG', 'GESTAO', 'Práticas ambientais, sociais e de governança');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('TailwindCSS', 'TECNOLOGIA', 'Estilização responsiva');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('Flask', 'TECNOLOGIA', 'APIs leves para ML/serviços');
INSERT INTO ES_habilidade (nm_habilidade, tp_categoria, ds_habilidade) VALUES
('Quarkus', 'TECNOLOGIA', 'Framework Java para APIs REST');

INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(1, 3, 'Mutirão de Documentação', 'Apoio a famílias na emissão de documentos básicos.', 'ATIVO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(2, 8, 'Laboratório ODS na Comunidade', 'Projetos de extensão para alfabetização digital.', 'EM_ANDAMENTO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(3, 4, 'Eficiência Energética em Escolas', 'Diagnóstico e plano de redução de consumo.', 'ATIVO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(4, 8, 'Cadastro Único Integrado', 'Aprimorar sistemas de assistência com integração.', 'RASCUNHO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(5, 6, 'Saúde Mental na Universidade', 'Atividades e atendimento comunitário.', 'ATIVO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(6, 7, 'Tech Mentorias', 'Mentorias técnicas para jovens de baixa renda.', 'ATIVO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(7, 2, 'Programa de Extensão AgroTech', 'Capacitação em tecnologias agrícolas sustentáveis.', 'EM_ANDAMENTO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(8, 9, 'Educação Acessível 2.0', 'Material didático acessível e plataforma inclusiva.', 'ATIVO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(9, 8, 'Atlas de Árvores Urbanas', 'Mapeamento colaborativo e manutenção preventiva.', 'ATIVO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(10, 11, 'Inventário de Emissões', 'Relatório padronizado para escopos 1 e 2.', 'RASCUNHO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(11, 13, 'Capacitação Digital para Mulheres', 'Cursos rápidos e mentorias de carreira.', 'ATIVO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(12, 14, 'Inovação Aberta com Startups', 'Desafios corporativos com equipes acadêmicas.', 'EM_ANDAMENTO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(13, 8, 'Indicadores de Inovação Pública', 'Métricas e dashboards de serviços públicos.', 'ATIVO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(14, 7, 'Reflorestamento Comunitário', 'Campanhas e gestão de viveiros.', 'ATIVO', SYSTIMESTAMP);
INSERT INTO ES_projeto (id_organizacao, id_responsavel, nm_titulo, ds_projeto, st_projeto, dt_criacao) VALUES
(15, 3, 'Rede de Apoio a Vítimas', 'Atendimento e encaminhamento com parceiros.', 'ATIVO', SYSTIMESTAMP);

INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(1, 1, 'INTERMEDIARIO', 1.5);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(2, 9, 'BASICO', 0.5);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(3, 6, 'INTERMEDIARIO', 2.0);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(4, 12, 'AVANCADO', 7.0);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(5, 9, 'BASICO', 1.0);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(6, 11, 'INTERMEDIARIO', 3.0);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(7, 14, 'AVANCADO', 5.0);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(8, 7, 'AVANCADO', 8.0);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(9, 10, 'INTERMEDIARIO', 2.5);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(10, 5, 'INTERMEDIARIO', 2.5);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(11, 13, 'BASICO', 1.0);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(12, 15, 'INTERMEDIARIO', 3.0);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(13, 4, 'AVANCADO', 6.0);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(14, 2, 'INTERMEDIARIO', 2.0);
INSERT INTO ES_usuario_habilidade (id_usuario, id_habilidade, st_nivel, vl_anos_experiencia) VALUES
(15, 1, 'BASICO', 0.5);

INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(1, 1, 'ACEITA', 20.0, 12.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(2, 3, 'PENDENTE', 16.0, 0.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(5, 2, 'ACEITA', 24.0, 8.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(10, 3, 'CONCLUIDA', 18.0, 18.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(12, 8, 'ACEITA', 12.0, 6.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(15, 9, 'ACEITA', 10.0, 4.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(1, 5, 'PENDENTE', 14.0, 0.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(2, 6, 'ACEITA', 22.0, 11.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(5, 7, 'RECUSADA', 15.0, 0.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(10, 11, 'ACEITA', 12.0, 9.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(12, 12, 'PENDENTE', 20.0, 0.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(15, 14, 'ACEITA', 25.0, 5.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(1, 13, 'ACEITA', 8.0, 3.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(2, 10, 'CANCELADA', 10.0, 2.0, SYSTIMESTAMP);
INSERT INTO ES_candidatura (id_usuario, id_projeto, st_candidatura, vl_horas_previstas, vl_horas_entregues, dt_candidatura) VALUES
(5, 15, 'ACEITA', 18.0, 7.0, SYSTIMESTAMP);

INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(1, 3, 'RELATORIO', '/docs/mutirao/relatorio_abril.pdf', 'beneficiarios', 120, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(3, 4, 'DOCUMENTO', '/docs/energia/auditoria_escolas.pdf', 'reducao_kwh', 15000, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(5, 6, 'IMAGEM', '/imgs/saude/atividade1.jpg', 'sessoes_realizadas', 20, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(6, 7, 'RELATORIO', '/docs/mentorias/mentorias_q2.pdf', 'jovens_atendidos', 85, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(8, 9, 'DOCUMENTO', '/docs/acessivel/manual_design.pdf', 'materiais_acessiveis', 12, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(9, 8, 'LINK', 'https://mapa.arvores.sp.gov.br/projeto', 'arvores_mapeadas', 2200, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(11, 13, 'RELATORIO', '/docs/mulheres/relatorio_impacto.pdf', 'participantes', 140, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(12, 14, 'DOCUMENTO', '/docs/inovacao/desafio1.pdf', 'propostas_recebidas', 30, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(14, 7, 'IMAGEM', '/imgs/reflorestamento/viveiro1.png', 'mudas_produzidas', 5000, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(10, 11, 'RELATORIO', '/docs/emissoes/inventario_v1.pdf', 'tCO2e', 320.5, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(2, 8, 'LINK', 'https://extensao.upf.edu.br/ods_lab', 'laboratorios_criados', 4, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(13, 8, 'RELATORIO', '/docs/indicadores/publicos_v1.pdf', 'indicadores_publicos', 18, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(15, 3, 'DOCUMENTO', '/docs/apoio/encaminhamentos.pdf', 'encaminhamentos', 65, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(4, 8, 'RELATORIO', '/docs/assistencia/cadastro_unico.pdf', 'familias_integradas', 240, SYSTIMESTAMP);
INSERT INTO ES_evidencia (id_projeto, id_autor, tp_evidencia, nm_caminho_arquivo, nm_indicador_impacto, vl_indicador, dt_envio) VALUES
(7, 2, 'LINK', 'https://ufse.edu.br/agrotech', 'alunos_capacitados', 110, SYSTIMESTAMP);

INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(1, 'ODS10', 'beneficiarios_atendidos', 120, DATE '2025-05-31');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(2, 'ODS4', 'laboratorios_criados', 4, DATE '2025-06-15');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(3, 'ODS7', 'reducao_consumo_kwh', 15000, DATE '2025-06-30');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(4, 'ODS1', 'familias_integradas', 240, DATE '2025-06-20');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(5, 'ODS3', 'sessoes_saude_mental', 20, DATE '2025-06-10');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(6, 'ODS8', 'mentorias_realizadas', 85, DATE '2025-06-25');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(7, 'ODS9', 'alunos_capacitados', 110, DATE '2025-07-05');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(8, 'ODS4', 'materiais_acessiveis', 12, DATE '2025-06-12');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(9, 'ODS11', 'arvores_mapeadas', 2200, DATE '2025-06-22');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(10, 'ODS13', 'emissoes_totais_tCO2e', 320.5, DATE '2025-06-30');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(11, 'ODS5', 'mulheres_capacitadas', 140, DATE '2025-06-18');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(12, 'ODS9', 'propostas_inovacao', 30, DATE '2025-06-27');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(13, 'ODS16', 'indicadores_publicos', 18, DATE '2025-06-14');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(14, 'ODS15', 'mudas_produzidas', 5000, DATE '2025-06-16');
INSERT INTO ES_relatorio_impacto (id_projeto, cd_ods_meta, nm_indicador, vl_indicador, dt_relatorio) VALUES
(15, 'ODS10', 'encaminhamentos_realizados', 65, DATE '2025-06-19');