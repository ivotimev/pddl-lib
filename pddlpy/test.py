import unittest
import os

from pddlpy import DomainProblem


class TestStringMethods(unittest.TestCase):

    def test_ground(self):
        domainfile = "../examples-pddl/domain-0%d.pddl" % 1
        problemfile = "../examples-pddl/problem-0%d.pddl" % 1

        domprob = DomainProblem(domainfile, problemfile)
        freeop = domprob.domain.operators["op2"]
        all_grounded_opers = domprob.ground_operator("op2")
        for gop in all_grounded_opers:
            if gop.precondition_pos == {('S','R','C'),('S','R','S')}:
                self.assertTrue(True)
                return
        self.assertFalse("Missed a value")

    def test_parameters(self):
        domainfile = "../examples-pddl/domain-0%d.pddl" % 4
        problemfile = "../examples-pddl/problem-0%d.pddl" % 4
        domprob = DomainProblem(domainfile, problemfile)
        print(domprob.domain.operators['move'].variable_list)
        print(domprob.domain.operators['load'].variable_list)

        move = list(domprob.ground_operator('move'))[0]
        load = list(domprob.ground_operator('load'))[0]

        self.assertNotEqual(move.variable_list, load.variable_list)


if __name__ == '__main__':
    unittest.main()

