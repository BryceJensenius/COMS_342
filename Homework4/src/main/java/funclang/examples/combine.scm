(define student_grades (list (cons 0 90) (cons 1 85) (cons 2 92)))

(define get_scores
    (lambda (lstPair)
        (if (null? lstPair)
            (list)
            (let ((pair (car lstPair)))
                (if (null? (cdr pair))
                    (get_scores (cdr lstPair))
                    (cons (cdr pair) (get_scores (cdr lstPair)))
                )
            )
        )
    )
)

(define validateCombineInput
    (lambda (lstA lstB)
        (if (null? lstA)
            #f
            (if (null? lstB)
                #f
                (if (null? (cdr lstA))
                    (null? (cdr lstB))
                    (validateCombineInput (cdr lstA) (cdr lstB))
                )
            )
        )
    )
)

(define combine
    (lambda (lstA lstB)
        (if (validateCombineInput lstA lstB)
            (cons (cons (car lstA) (car lstB)) (combine (cdr lstA) (cdr lstB)))
            (list)
        )
    )
)