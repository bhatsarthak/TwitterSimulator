import powerlaw
import sys,ast

filename = sys.argv[1]

data = ast.literal_eval( sys.argv[1] )
results = powerlaw.Fit(data)
print "Gamma value", results.power_law.alpha
	

