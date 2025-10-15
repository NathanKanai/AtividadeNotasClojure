(ns atividades.exercicio01)

(defn -main []
  (println "Insira a quantidade de alunos dessa turma:")
  (let [total (Integer/parseInt (read-line))]
    
    (def acumulado 0)
    (def count-aprovados 0)
    
    (dotimes [idx total]
      (println (str "\nEscreva o nome do aluno " (inc idx) ":"))
      (def estudante (read-line))
      (println "Insira a nota desse aluno:")
      (def pontuacao (Double/parseDouble (read-line)))

      (def classificacao
        (cond
          (>= pontuacao 90) "A"
          (>= pontuacao 80) "B"
          (>= pontuacao 70) "C"
          (>= pontuacao 60) "D"
          :else "F"))

      (println (str estudante " - Classificação: " classificacao))

      (def acumulado (+ acumulado pontuacao))
      (if (>= pontuacao 60)
        (def count-aprovados (+ count-aprovados 1))))
    
    (def media-geral (/ acumulado total))
    (println (str "\nMédia dessa turma: " media-geral))
    (println (str "Total de aprovados: " count-aprovados))
    
    (if (>= media-geral 80)
      (println "Resultado geral: Excelente desempenho da turma!")
      (if (>= media-geral 60)
        (println "Resultado geral: Desempenho satisfatório.")
        (println "Resultado geral: Desempenho precisa melhorar.")))))
