SELECT
     receitas.`descricao` AS receitas_descricao,
     receitas.`valor` AS receitas_valor,
     receitas.`periodo` AS receitas_periodo,
     receitas.`categoria` AS receitas_categoria,
     despesas.`descricao` AS despesas_descricao,
     despesas.`valor` AS despesas_valor,
     despesas.`periodo` AS despesas_periodo,
     despesas.`categoria` AS despesas_categoria
FROM
     `users` users INNER JOIN `despesas` despesas ON users.`ID_usuario` = despesas.`ID_usuario`
     INNER JOIN `receitas` receitas ON users.`ID_usuario` = receitas.`ID_usuario`